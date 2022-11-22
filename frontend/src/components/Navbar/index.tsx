import {ReactComponent as GitHubIcon} from 'assets/img/gitimg.svg'
import './style.css'

function Navbar() {
    return (
        <header >
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a href="https://github.com/CleuJunior">
              <div className="dsmovie-contact-container">
                <GitHubIcon/>
                <p className="dsmovie-contact-link">/cleujunior</p>
                
              </div>
            </a>
          </div>
  
        </nav>
      </header>
    );
}

export default Navbar;